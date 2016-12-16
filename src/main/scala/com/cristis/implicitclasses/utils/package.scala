package com.cristis.implicitclasses

/** ***********************************************************************
  * Copyright (c) Metabiota Incorporated - All Rights Reserved
  * ------------------------------------------------------------------------
  * This material is proprietary to Metabiota Incorporated. The 
  * intellectual and technical concepts contained herein are proprietary
  * to Metabiota Incorporated. Reproduction or distribution of this
  * material, in whole or in part, is strictly forbidden unless prior 
  * written permission is obtained from Metabiota Incorporated.
  * ************************************************************************/

/**
  * Created by cristian.schuszter on 2016-12-16.
  */
package object utils {
  implicit class StringImprovements(s: String) {
    def increment = s.map(c => (c+1).toChar)
  }
}
