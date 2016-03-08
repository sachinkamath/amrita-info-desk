/*
 * Copyright (c) 2016. Niranjan Rajendran <niranjan94@yahoo.com>
 */

package com.njlabs.amrita.aid.aums.responses;

import com.njlabs.amrita.aid.aums.models.CourseGradeData;

import java.util.List;

public abstract class GradesResponse extends AumsBaseResponse {
    public abstract void onSuccess(String sgpa, List<CourseGradeData> gradeDataList);
    public abstract void onDataUnavailable();
}