package com.forsale.app.utils;

import java.net.URL;
/* compiled from: UrlExtensions.kt */
/* loaded from: classes3.dex */
public final class f0 {
    public static final String a(URL url) {
        kotlin.jvm.internal.o.i(url, "<this>");
        String protocol = url.getProtocol();
        String host = url.getHost();
        return protocol + "://" + host;
    }
}
