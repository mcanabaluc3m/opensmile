#----------------------------------------------------------------
# Generated CMake target import file for configuration "Debug".
#----------------------------------------------------------------

# Commands may need to know the format version.
set(CMAKE_IMPORT_FILE_VERSION 1)

# Import target "SMILEapi" for configuration "Debug"
set_property(TARGET SMILEapi APPEND PROPERTY IMPORTED_CONFIGURATIONS DEBUG)
set_target_properties(SMILEapi PROPERTIES
  IMPORTED_LOCATION_DEBUG "${_IMPORT_PREFIX}/lib/libSMILEapi.so"
  IMPORTED_SONAME_DEBUG "libSMILEapi.so"
  )

list(APPEND _IMPORT_CHECK_TARGETS SMILEapi )
list(APPEND _IMPORT_CHECK_FILES_FOR_SMILEapi "${_IMPORT_PREFIX}/lib/libSMILEapi.so" )

# Commands beyond this point should not need to know the version.
set(CMAKE_IMPORT_FILE_VERSION)
