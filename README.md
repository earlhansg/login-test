# Login / Sign-up Test

This personal project is designed for Login & Registration use cases test.

## Requirements
- Selenium
- TestNg
- Commons-io
- Apache.poi

## Login Test's feature
- a typical setup like one user sign-in its credentials and return expected message whether fail or pass.

## Multiple Users Login Test's feature
- this setup includes excel spreadsheets that have multiple credentials and use it continuously in our test which will return if each creadential has failed or passed.

## Sign-up Test's feature
- a typical setup like one user will sign-up and fill in the form for his/her personal information then be registered as a user.

## Sign-up With Generate Password
- the [site](https://phptravels.com/demo/) I've use has feature that user can generate his/her own password for registration and that's why i created this test.

## Issues
- the [site](https://phptravels.com/demo/) uses captcha so there's a time that my code can't bypass it.

## How to fix the Issue
- by WebDriverWait but sometimes is not working. This is the method that i used.
- ask the owner of the site to disable the captcha.
- use third party package like [2Captcha](https://2captcha.com/) or any provider you prefer.