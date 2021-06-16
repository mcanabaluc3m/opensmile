/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.audeering.opensmile;

public class CallbackExternalSink {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CallbackExternalSink(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CallbackExternalSink obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OpenSMILEJNI.delete_CallbackExternalSink(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    OpenSMILEJNI.CallbackExternalSink_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    OpenSMILEJNI.CallbackExternalSink_change_ownership(this, swigCPtr, true);
  }

  public CallbackExternalSink() {
    this(OpenSMILEJNI.new_CallbackExternalSink(), true);
    OpenSMILEJNI.CallbackExternalSink_director_connect(this, swigCPtr, true, true);
  }

  public boolean onCalledExternalSinkCallback(float[] data) {
    return OpenSMILEJNI.CallbackExternalSink_onCalledExternalSinkCallback(swigCPtr, this, data);
  }

  public SWIGTYPE_p_f_p_q_const__float_long_p_void__bool createExternalSinkCallback() {
    long cPtr = OpenSMILEJNI.CallbackExternalSink_createExternalSinkCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__float_long_p_void__bool(cPtr, false);
  }

}
