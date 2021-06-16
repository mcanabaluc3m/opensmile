#----------------------------------------------------------------
# Generated CMake target import file for configuration "Debug".
#----------------------------------------------------------------

# Commands may need to know the format version.
set(CMAKE_IMPORT_FILE_VERSION 1)

# Import target "opensmile" for configuration "Debug"
set_property(TARGET opensmile APPEND PROPERTY IMPORTED_CONFIGURATIONS DEBUG)
set_target_properties(opensmile PROPERTIES
  IMPORTED_LOCATION_DEBUG "${_IMPORT_PREFIX}/lib/libopensmile.so"
  IMPORTED_SONAME_DEBUG "libopensmile.so"
  )

list(APPEND _IMPORT_CHECK_TARGETS opensmile )
list(APPEND _IMPORT_CHECK_FILES_FOR_opensmile "${_IMPORT_PREFIX}/lib/libopensmile.so" )

# Commands beyond this point should not need to know the version.
set(CMAKE_IMPORT_FILE_VERSION)
