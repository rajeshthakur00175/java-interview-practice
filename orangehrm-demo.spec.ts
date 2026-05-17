// spec: specs/orangehrm-demo-test-plan.md
// seed: seed.spec.ts

import { test, expect } from '@playwright/test';

const loginUrl = 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login';

test.describe('OrangeHRM Demo Login and Dashboard', () => {
  // @ts-ignore
  test('Login with valid credentials', async ({ page }) => {
    // 1. Open https://opensource-demo.orangehrmlive.com/web/index.php/auth/login.
    await page.goto(loginUrl);
    await expect(page).toHaveTitle('OrangeHRM');
    await expect(page.getByText('Username : Admin')).toBeVisible();
    await expect(page.getByText('Password : admin123')).toBeVisible();

    // 2. Enter Username = Admin and Password = admin123.
    await page.fill('input[name="username"]', 'Admin');
    await page.fill('input[name="password"]', 'admin123');

    // 3. Click the Login button.
    await page.click('button[type="submit"]');
    await expect(page).toHaveURL(/dashboard\/index/);
    await expect(page.getByRole('heading', { name: 'Dashboard' })).toBeVisible();
    await expect(page.getByText('Admin')).toBeVisible();
    await expect(page.getByText('PIM')).toBeVisible();
    await expect(page.getByText('Mikheil Mezurnishvili')).toBeVisible();
  });

  // @ts-ignore
  test('Login with invalid credentials', async ({ page }) => {
    // 1. Open the login page.
    await page.goto(loginUrl);

    // 2. Enter Username = wrong and Password = badpass.
    await page.fill('input[name="username"]', 'wrong');
    await page.fill('input[name="password"]', 'badpass');

    // 3. Click the Login button.
    await page.click('button[type="submit"]');
    await expect(page).toHaveURL(/auth\/login/);
    await expect(page.getByText('Invalid credentials')).toBeVisible();
  });

  // @ts-ignore
  test('Login with empty credentials', async ({ page }) => {
    // 1. Open the login page.
    await page.goto(loginUrl);

    // 2. Leave Username and Password blank and click Login.
    await page.fill('input[name="username"]', '');
    await page.fill('input[name="password"]', '');
    await page.click('button[type="submit"]');

    const requiredMessages = page.locator('text=Required');
    await expect(requiredMessages).toHaveCount(2);
    await expect(page).toHaveURL(/auth\/login/);
  });

  // @ts-ignore
  test('Dashboard navigation after successful login', async ({ page }) => {
    // 1. Open the login page and sign in with Admin/admin123.
    await page.goto(loginUrl);
    await page.fill('input[name="username"]', 'Admin');
    await page.fill('input[name="password"]', 'admin123');
    await page.click('button[type="submit"]');
    await expect(page).toHaveURL(/dashboard\/index/);
    await expect(page.getByRole('heading', { name: 'Dashboard' })).toBeVisible();

    // 2. Verify that the dashboard side panel shows module links such as Admin, PIM, Leave, Time, Recruitment, My Info, and Directory.
    await expect(page.getByRole('link', { name: 'Admin' })).toBeVisible();
    await expect(page.getByRole('link', { name: 'PIM' })).toBeVisible();
    await expect(page.getByRole('link', { name: 'Leave' })).toBeVisible();
    await expect(page.getByRole('link', { name: 'Time' })).toBeVisible();
    await expect(page.getByRole('link', { name: 'Recruitment' })).toBeVisible();
    await expect(page.getByRole('link', { name: 'My Info' })).toBeVisible();
    await expect(page.getByRole('link', { name: 'Directory' })).toBeVisible();

    // 3. Click one available module link, for example Admin.
    await page.getByRole('link', { name: 'Admin' }).first().click();
    await expect(page).toHaveURL(/admin\/viewSystemUsers/);
    await expect(page.getByText('System Users')).toBeVisible();
  });
});
