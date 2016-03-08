/*
 * Copyright (c) 2016. Niranjan Rajendran <niranjan94@yahoo.com>
 */

package com.njlabs.amrita.aid.util.okhttp.responses;

import java.io.File;

public abstract class FileResponse extends BaseResponse {
    public abstract void onSuccess(File file);
}