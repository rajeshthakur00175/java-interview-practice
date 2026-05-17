# OrangeHRM Demo Website Test Plan

## Application Overview

Functional test plan for OrangeHRM demo login and dashboard flow. Covers success path, invalid inputs, validation, and main dashboard navigation.

## Test Scenarios

### 1. OrangeHRM Demo Login and Dashboard

**Seed:** `seed.spec.ts`

#### 1.1. Login with valid credentials

**File:** `specs/orangehrm-demo-test-plan.md`

**Steps:**
  1. Open https://opensource-demo.orangehrmlive.com/web/index.php/auth/login.
    - expect: The page title is OrangeHRM.
    - expect: The login form is displayed with Username and Password fields and a Login button.
    - expect: The demo credentials hint shows Username : Admin and Password : admin123.
  2. Enter Username = Admin and Password = admin123.
    - expect: Username and Password values are accepted in the form fields.
  3. Click the Login button.
    - expect: The application navigates to /web/index.php/dashboard/index.
    - expect: A Dashboard heading is visible.
    - expect: The side panel displays main modules such as Admin, PIM, Leave, Time, Recruitment, My Info, and Dashboard.
    - expect: The logged-in profile name or profile avatar is visible.

#### 1.2. Login with invalid credentials

**File:** `specs/orangehrm-demo-test-plan.md`

**Steps:**
  1. Open the login page.
    - expect: The login page is displayed.
  2. Enter Username = wrong and Password = badpass.
    - expect: The login form fields accept values.
  3. Click the Login button.
    - expect: The login attempt fails and the page remains on the login screen.
    - expect: An error alert displays the message 'Invalid credentials'.

#### 1.3. Login with empty credentials

**File:** `specs/orangehrm-demo-test-plan.md`

**Steps:**
  1. Open the login page.
    - expect: The login page is displayed.
  2. Leave Username and Password blank and click Login.
    - expect: Inline validation messages appear for both fields.
    - expect: Each empty field shows 'Required'.
    - expect: No successful login occurs.

#### 1.4. Dashboard navigation after successful login

**File:** `specs/orangehrm-demo-test-plan.md`

**Steps:**
  1. Open the login page and sign in with Admin/admin123.
    - expect: The Dashboard loads successfully.
  2. Verify that the dashboard side panel shows module links such as Admin, PIM, Leave, Time, Recruitment, My Info, and Directory.
    - expect: Each displayed module link is visible and clickable.
  3. Click one available module link, for example Admin.
    - expect: The application navigates to the selected module URL (for example /web/index.php/admin/viewAdminModule).
    - expect: The target module page title or heading is displayed.
