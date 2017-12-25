JavaCPP Presets for libpostal
========================

Introduction
------------
This directory contains the JavaCPP Presets module for:

 * libpostal 1.0  https://github.com/openvenues/libpostal
 
libpostal is a C library for parsing/normalizing street addresses around the world using statistical NLP and open data.
The goal of this project is to understand location-based strings in every language, everywhere.

Documentation
-------------
Java API documentation is available here:

 * http://bytedeco.org/javacpp-presets/libpostal/apidocs/


Sample Usage
------------
```java
boolean setup1 = libpostal.libpostal_setup();
BytePointer trainingDataPath = new BytePointer("C:/libpostal", "UTF-8");
boolean setup3 = libpostal.libpostal_setup_datadir(trainingDataPath);
boolean setup2 = libpostal.libpostal_setup_language_classifier();
libpostal.libpostal_normalize_options_t options = libpostal.libpostal_get_default_options();
SizeTPointer sizeTPointer = new SizeTPointer(0);
BytePointer address = new BytePointer("Quatre vingt douze Ave des Champs-Elysees", "UTF-8");
PointerPointer pointerPointer = libpostal.libpostal_expand_address(address, options, sizeTPointer);
long t_size = sizeTPointer.get(0);
for (long i = 0; i < t_size; i++) {
    System.out.println(pointerPointer.getString(i));
}
libpostal.libpostal_teardown();
libpostal.libpostal_teardown_language_classifier();