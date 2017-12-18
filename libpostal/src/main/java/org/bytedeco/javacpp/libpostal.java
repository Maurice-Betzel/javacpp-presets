// Targeted by JavaCPP version 1.3.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class libpostal extends org.bytedeco.javacpp.presets.libpostal {
    static { Loader.load(); }

// Parsed from <libpostal.h>

// #ifndef LIBPOSTAL_H
// #define LIBPOSTAL_H

// #ifdef __cplusplus
// #endif

// #include <stdio.h>
// #include <stdlib.h>
// #include <stdint.h>
// #include <stdbool.h>

// #ifdef _WIN32
// #ifdef LIBPOSTAL_EXPORTS
// #define LIBPOSTAL_EXPORT __declspec(dllexport)
// #else
// #define LIBPOSTAL_EXPORT __declspec(dllimport)
// #endif
// #elif __GNUC__ >= 4
// #define LIBPOSTAL_EXPORT __attribute__ ((visibility("default")))
// #else
// #define LIBPOSTAL_EXPORT
// #endif

public static final int LIBPOSTAL_MAX_LANGUAGE_LEN = 4;

/* 
Address dictionaries
*/
// Bit set, should be able to keep it at a short (uint16_t)
public static final int LIBPOSTAL_ADDRESS_NONE = 0;
public static final int LIBPOSTAL_ADDRESS_ANY = (1 << 0);
public static final int LIBPOSTAL_ADDRESS_NAME = (1 << 1);
public static final int LIBPOSTAL_ADDRESS_HOUSE_NUMBER = (1 << 2);
public static final int LIBPOSTAL_ADDRESS_STREET = (1 << 3);
public static final int LIBPOSTAL_ADDRESS_UNIT = (1 << 4);
public static final int LIBPOSTAL_ADDRESS_LEVEL = (1 << 5);
public static final int LIBPOSTAL_ADDRESS_STAIRCASE = (1 << 6);
public static final int LIBPOSTAL_ADDRESS_ENTRANCE = (1 << 7);

public static final int LIBPOSTAL_ADDRESS_CATEGORY = (1 << 8);
public static final int LIBPOSTAL_ADDRESS_NEAR = (1 << 9);

public static final int LIBPOSTAL_ADDRESS_TOPONYM = (1 << 13);
public static final int LIBPOSTAL_ADDRESS_POSTAL_CODE = (1 << 14);
public static final int LIBPOSTAL_ADDRESS_PO_BOX = (1 << 15);
public static final int LIBPOSTAL_ADDRESS_ALL = ((1 << 16) - 1);

public static class libpostal_normalize_options_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public libpostal_normalize_options_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public libpostal_normalize_options_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public libpostal_normalize_options_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public libpostal_normalize_options_t position(long position) {
        return (libpostal_normalize_options_t)super.position(position);
    }

    // List of language codes
    public native @Cast("char*") BytePointer languages(int i); public native libpostal_normalize_options_t languages(int i, BytePointer languages);
    public native @Cast("char**") PointerPointer languages(); public native libpostal_normalize_options_t languages(PointerPointer languages);  
    public native @Cast("size_t") long num_languages(); public native libpostal_normalize_options_t num_languages(long num_languages);
    public native @Cast("uint16_t") short address_components(); public native libpostal_normalize_options_t address_components(short address_components);

    // String options
    public native @Cast("bool") boolean latin_ascii(); public native libpostal_normalize_options_t latin_ascii(boolean latin_ascii);
    public native @Cast("bool") boolean transliterate(); public native libpostal_normalize_options_t transliterate(boolean transliterate);
    public native @Cast("bool") boolean strip_accents(); public native libpostal_normalize_options_t strip_accents(boolean strip_accents);
    public native @Cast("bool") boolean decompose(); public native libpostal_normalize_options_t decompose(boolean decompose);
    public native @Cast("bool") boolean lowercase(); public native libpostal_normalize_options_t lowercase(boolean lowercase);
    public native @Cast("bool") boolean trim_string(); public native libpostal_normalize_options_t trim_string(boolean trim_string);
    public native @Cast("bool") boolean drop_parentheticals(); public native libpostal_normalize_options_t drop_parentheticals(boolean drop_parentheticals);
    public native @Cast("bool") boolean replace_numeric_hyphens(); public native libpostal_normalize_options_t replace_numeric_hyphens(boolean replace_numeric_hyphens);
    public native @Cast("bool") boolean delete_numeric_hyphens(); public native libpostal_normalize_options_t delete_numeric_hyphens(boolean delete_numeric_hyphens);
    public native @Cast("bool") boolean split_alpha_from_numeric(); public native libpostal_normalize_options_t split_alpha_from_numeric(boolean split_alpha_from_numeric);
    public native @Cast("bool") boolean replace_word_hyphens(); public native libpostal_normalize_options_t replace_word_hyphens(boolean replace_word_hyphens);
    public native @Cast("bool") boolean delete_word_hyphens(); public native libpostal_normalize_options_t delete_word_hyphens(boolean delete_word_hyphens);
    public native @Cast("bool") boolean delete_final_periods(); public native libpostal_normalize_options_t delete_final_periods(boolean delete_final_periods);
    public native @Cast("bool") boolean delete_acronym_periods(); public native libpostal_normalize_options_t delete_acronym_periods(boolean delete_acronym_periods);
    public native @Cast("bool") boolean drop_english_possessives(); public native libpostal_normalize_options_t drop_english_possessives(boolean drop_english_possessives);
    public native @Cast("bool") boolean delete_apostrophes(); public native libpostal_normalize_options_t delete_apostrophes(boolean delete_apostrophes);
    public native @Cast("bool") boolean expand_numex(); public native libpostal_normalize_options_t expand_numex(boolean expand_numex);
    public native @Cast("bool") boolean roman_numerals(); public native libpostal_normalize_options_t roman_numerals(boolean roman_numerals);

}

public static native @ByVal libpostal_normalize_options_t libpostal_get_default_options();

public static native @Cast("char**") PointerPointer libpostal_expand_address(@Cast("char*") BytePointer input, @ByVal libpostal_normalize_options_t options, @Cast("size_t*") SizeTPointer n);
public static native @Cast("char**") @ByPtrPtr ByteBuffer libpostal_expand_address(@Cast("char*") ByteBuffer input, @ByVal libpostal_normalize_options_t options, @Cast("size_t*") SizeTPointer n);
public static native @Cast("char**") @ByPtrPtr byte[] libpostal_expand_address(@Cast("char*") byte[] input, @ByVal libpostal_normalize_options_t options, @Cast("size_t*") SizeTPointer n);

public static native void libpostal_expansion_array_destroy(@Cast("char**") PointerPointer expansions, @Cast("size_t") long n);
public static native void libpostal_expansion_array_destroy(@Cast("char**") @ByPtrPtr BytePointer expansions, @Cast("size_t") long n);
public static native void libpostal_expansion_array_destroy(@Cast("char**") @ByPtrPtr ByteBuffer expansions, @Cast("size_t") long n);
public static native void libpostal_expansion_array_destroy(@Cast("char**") @ByPtrPtr byte[] expansions, @Cast("size_t") long n);

/*
Address parser
*/

public static class libpostal_address_parser_response_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public libpostal_address_parser_response_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public libpostal_address_parser_response_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public libpostal_address_parser_response_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public libpostal_address_parser_response_t position(long position) {
        return (libpostal_address_parser_response_t)super.position(position);
    }

    public native @Cast("size_t") long num_components(); public native libpostal_address_parser_response_t num_components(long num_components);
    public native @Cast("char*") BytePointer components(int i); public native libpostal_address_parser_response_t components(int i, BytePointer components);
    public native @Cast("char**") PointerPointer components(); public native libpostal_address_parser_response_t components(PointerPointer components);
    public native @Cast("char*") BytePointer labels(int i); public native libpostal_address_parser_response_t labels(int i, BytePointer labels);
    public native @Cast("char**") PointerPointer labels(); public native libpostal_address_parser_response_t labels(PointerPointer labels);
}

public static class libpostal_address_parser_options_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public libpostal_address_parser_options_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public libpostal_address_parser_options_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public libpostal_address_parser_options_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public libpostal_address_parser_options_t position(long position) {
        return (libpostal_address_parser_options_t)super.position(position);
    }

    public native @Cast("char*") BytePointer language(); public native libpostal_address_parser_options_t language(BytePointer language);
    public native @Cast("char*") BytePointer country(); public native libpostal_address_parser_options_t country(BytePointer country);
}

public static native void libpostal_address_parser_response_destroy(libpostal_address_parser_response_t self);

public static native @ByVal libpostal_address_parser_options_t libpostal_get_address_parser_default_options();

public static native libpostal_address_parser_response_t libpostal_parse_address(@Cast("char*") BytePointer address, @ByVal libpostal_address_parser_options_t options);
public static native libpostal_address_parser_response_t libpostal_parse_address(@Cast("char*") ByteBuffer address, @ByVal libpostal_address_parser_options_t options);
public static native libpostal_address_parser_response_t libpostal_parse_address(@Cast("char*") byte[] address, @ByVal libpostal_address_parser_options_t options);

public static native @Cast("bool") boolean libpostal_parser_print_features(@Cast("bool") boolean print_features);

// Setup/teardown methods

public static native @Cast("bool") boolean libpostal_setup();
public static native @Cast("bool") boolean libpostal_setup_datadir(@Cast("char*") BytePointer datadir);
public static native @Cast("bool") boolean libpostal_setup_datadir(@Cast("char*") ByteBuffer datadir);
public static native @Cast("bool") boolean libpostal_setup_datadir(@Cast("char*") byte[] datadir);
public static native void libpostal_teardown();

public static native @Cast("bool") boolean libpostal_setup_parser();
public static native @Cast("bool") boolean libpostal_setup_parser_datadir(@Cast("char*") BytePointer datadir);
public static native @Cast("bool") boolean libpostal_setup_parser_datadir(@Cast("char*") ByteBuffer datadir);
public static native @Cast("bool") boolean libpostal_setup_parser_datadir(@Cast("char*") byte[] datadir);
public static native void libpostal_teardown_parser();

public static native @Cast("bool") boolean libpostal_setup_language_classifier();
public static native @Cast("bool") boolean libpostal_setup_language_classifier_datadir(@Cast("char*") BytePointer datadir);
public static native @Cast("bool") boolean libpostal_setup_language_classifier_datadir(@Cast("char*") ByteBuffer datadir);
public static native @Cast("bool") boolean libpostal_setup_language_classifier_datadir(@Cast("char*") byte[] datadir);
public static native void libpostal_teardown_language_classifier();

// #ifdef __cplusplus
// #endif

// #endif


}
