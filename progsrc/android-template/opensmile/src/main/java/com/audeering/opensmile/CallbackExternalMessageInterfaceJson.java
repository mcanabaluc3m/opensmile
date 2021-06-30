/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.audeering.opensmile;

public class CallbackExternalMessageInterfaceJson {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CallbackExternalMessageInterfaceJson(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CallbackExternalMessageInterfaceJson obj) {
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
        OpenSMILEJNI.delete_CallbackExternalMessageInterfaceJson(swigCPtr);
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
    OpenSMILEJNI.CallbackExternalMessageInterfaceJson_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    OpenSMILEJNI.CallbackExternalMessageInterfaceJson_change_ownership(this, swigCPtr, true);
  }

  public CallbackExternalMessageInterfaceJson() {
    this(OpenSMILEJNI.new_CallbackExternalMessageInterfaceJson(), true);
    OpenSMILEJNI.CallbackExternalMessageInterfaceJson_director_connect(this, swigCPtr, true, true);
  }

  public boolean onCalledExternalMessageInterfaceJsonCallback(String msg) {
    return OpenSMILEJNI.CallbackExternalMessageInterfaceJson_onCalledExternalMessageInterfaceJsonCallback(swigCPtr, this, msg);
  }

  public SWIGTYPE_p_f_p_q_const__char_p_void__bool createExternalMessageInterfaceJsonCallback() {
    long cPtr = OpenSMILEJNI.CallbackExternalMessageInterfaceJson_createExternalMessageInterfaceJsonCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__char_p_void__bool(cPtr, false);
  }

}