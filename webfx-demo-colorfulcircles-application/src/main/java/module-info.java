// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.demo.colorfulcircles.application {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.graphics;

    // Exported packages
    exports dev.webfx.demo.colorfulcircles;

    // Provided services
    provides javafx.application.Application with dev.webfx.demo.colorfulcircles.ColorfulCircles;

}