package com.forsale.adserver.datalayer.network;

import com.google.gson.j;
import com.leanplum.internal.Constants;
import falcon.chat.entities.MessageKt;
import java.io.IOException;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ResponseWrapper.kt */
/* loaded from: classes2.dex */
public final class ResponseWrapper {
    @c(MessageKt.STATUS)

    /* renamed from: a  reason: collision with root package name */
    private final int f20698a;
    @c(Constants.Params.RESPONSE)

    /* renamed from: b  reason: collision with root package name */
    private final j f20699b;

    /* compiled from: ResponseWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class EmptyResponseWrapperException extends IOException {
        public EmptyResponseWrapperException() {
            super("Empty for q84sale response not allowed");
        }
    }

    /* compiled from: ResponseWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    public final a a() {
        return null;
    }

    public final j b() {
        return this.f20699b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseWrapper)) {
            return false;
        }
        ResponseWrapper responseWrapper = (ResponseWrapper) obj;
        if (this.f20698a == responseWrapper.f20698a && o.d(this.f20699b, responseWrapper.f20699b) && o.d(null, null)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f20698a) * 31;
        j jVar = this.f20699b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + 0;
    }

    public String toString() {
        int i11 = this.f20698a;
        j jVar = this.f20699b;
        return "ResponseWrapper(status=" + i11 + ", response=" + jVar + ", error=" + ((Object) null) + ")";
    }
}
