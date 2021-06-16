/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.audeering.opensmile;

public final class smilelogtype_t {
  public final static smilelogtype_t SMILE_LOG_MESSAGE = new smilelogtype_t("SMILE_LOG_MESSAGE", OpenSMILEJNI.SMILE_LOG_MESSAGE_get());
  public final static smilelogtype_t SMILE_LOG_WARNING = new smilelogtype_t("SMILE_LOG_WARNING", OpenSMILEJNI.SMILE_LOG_WARNING_get());
  public final static smilelogtype_t SMILE_LOG_ERROR = new smilelogtype_t("SMILE_LOG_ERROR", OpenSMILEJNI.SMILE_LOG_ERROR_get());
  public final static smilelogtype_t SMILE_LOG_DEBUG = new smilelogtype_t("SMILE_LOG_DEBUG", OpenSMILEJNI.SMILE_LOG_DEBUG_get());
  public final static smilelogtype_t SMILE_LOG_PRINT = new smilelogtype_t("SMILE_LOG_PRINT", OpenSMILEJNI.SMILE_LOG_PRINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static smilelogtype_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + smilelogtype_t.class + " with value " + swigValue);
  }

  private smilelogtype_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private smilelogtype_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private smilelogtype_t(String swigName, smilelogtype_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static smilelogtype_t[] swigValues = { SMILE_LOG_MESSAGE, SMILE_LOG_WARNING, SMILE_LOG_ERROR, SMILE_LOG_DEBUG, SMILE_LOG_PRINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

