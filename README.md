# Live demo

The demo is published on [this page][demo-live-link].

This is the first basic demo and perhaps one of the simplest JavaFX application you can write beyond Hello World.
Its main purpose is to highlight the essential features of WebFX, and to propose a starting frame for developing WebFX applications.

# Highlighted features

## Quick start and small footprint

This demo has a decent start time, and a quite small footprint (87 KB download) despite the big size of the JavaFX library.
This is achieved mainly thanks to the dead code elimination (DCE) feature of GWT.
The WebFX architecture is designed to make this DCE efficient and only the part of the JavaFX library required by your application will remain in the final web application. 

## JavaFX to HTML mapping

The main job of WebFX is to map all nodes of the JavaFX scene graph into HTML elements of the browser DOM.
If you inspect the demo DOM in your browser, you will recognize the JavaFX scene graph structure
(nodes have the "fx-" prefix, for example: fx-scene, fx-group, fx-circle, etc...).

## Reusability

This demo is an example of how you can easily reuse existing pieces of code written in JavaFX in a WebFX application.
In this case, we reused this [original code][oracle-source-link] of the Oracle demo and slightly modified it, so the circles better fit in the browser window
(because on the web platform, the window is sized by the browser, whereas on the JavaFX platform the window is sized by the code).
Here is the [resulting code][demo-source-link] of this demo.

## Cross-platform

Although WebFX is focusing on the web platform, it can be combined with other JavaFX tools to produce executables (including native) for all other major platforms.
This means that you can write WORA (Write Once Run Anywhere) applications with WebFX and target all these other platforms at the same time from a single source code.

For example, this demo has a [Github workflow][demo-workflow-link] triggered on each push on the main branch that automatically generates the executables for Windows, MacOS, Linux, Android & iOS and upload them in the assets of the current [SNAPSHOT release][demo-snapshot-release-link].
This workflow also copies the result of the GWT compilation into the [web-build branch][demo-web-build-branch-link] that Netlify uses as the source for the [live demo][demo-live-link].
In this way, the live demo is also automatically updated during this process. 

[demo-live-link]: https://colorfulcircles.webfx.dev
[demo-source-link]: https://github.com/webfx-project/webfx-demo-colorfulcircles/blob/main/webfx-demo-colorfulcircles-application/src/main/java/dev/webfx/demo/colorfulcircles/ColorfulCircles.java
[oracle-source-link]: https://docs.oracle.com/javafx/2/get_started/ColorfulCircles.java.html
[demo-workflow-link]: https://github.com/webfx-project/webfx-demo-colorfulcircles/blob/main/.github/workflows/builds.yml
[demo-snapshot-release-link]: https://github.com/webfx-project/webfx-demo-colorfulcircles/releases/tag/SNAPSHOT
[demo-web-build-branch-link]: https://github.com/webfx-project/webfx-demo-colorfulcircles/tree/web-build