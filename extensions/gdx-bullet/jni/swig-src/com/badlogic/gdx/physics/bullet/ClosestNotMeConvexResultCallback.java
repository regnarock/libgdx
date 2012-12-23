/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class ClosestNotMeConvexResultCallback extends ClosestConvexResultCallback {
  private long swigCPtr;

  protected ClosestNotMeConvexResultCallback(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.ClosestNotMeConvexResultCallback_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ClosestNotMeConvexResultCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_ClosestNotMeConvexResultCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_me(btCollisionObject value) {
    gdxBulletJNI.ClosestNotMeConvexResultCallback_m_me_set(swigCPtr, this, btCollisionObject.getCPtr(value), value);
  }

  public btCollisionObject getM_me() {
	long cPtr = gdxBulletJNI.ClosestNotMeConvexResultCallback_m_me_get(swigCPtr, this);
	return (cPtr == 0) ? null : btCollisionObject.getInstance(cPtr, false);
}

  public void setM_allowedPenetration(float value) {
    gdxBulletJNI.ClosestNotMeConvexResultCallback_m_allowedPenetration_set(swigCPtr, this, value);
  }

  public float getM_allowedPenetration() {
    return gdxBulletJNI.ClosestNotMeConvexResultCallback_m_allowedPenetration_get(swigCPtr, this);
  }

  public ClosestNotMeConvexResultCallback(btCollisionObject me, Vector3 fromA, Vector3 toA) {
    this(gdxBulletJNI.new_ClosestNotMeConvexResultCallback(btCollisionObject.getCPtr(me), me, fromA, toA), true);
  }

}