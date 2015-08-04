# CSRF POC Project

### Links

Here are the [links](https://gist.github.com/Krasnyanskiy/51adf0d9985381acbaed) to read ant try.

### How to make one-click attack

You can disable CSRF support via changing a flag in Spring configuration.

```xml
<security:csrf disabled="true"/>
```

This change allows you to perform a one-click attack. To make sure it works just fine you need to disable CSRF support in Spring configuration and press `Click me` button on jsFiddle [form](http://jsfiddle.net/krasnyanskiy/bfocngcq/9), and when you click on the `eye` on the main page, you'll notice that your form was actually updated. Is was hacked!
