package com.forsale.app.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
/* compiled from: Permissions.kt */
/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f40541a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f40542b;

    /* renamed from: c  reason: collision with root package name */
    protected g00.a<wz.p> f40543c;

    public u(int i11, String... permissions) {
        kotlin.jvm.internal.o.i(permissions, "permissions");
        this.f40541a = i11;
        this.f40542b = permissions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(u uVar, g00.p pVar, g00.a aVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                pVar = null;
            }
            uVar.f(pVar, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withPermission");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized g00.a<wz.p> a() {
        g00.a<wz.p> aVar = this.f40543c;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.w("onAllGranted");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.f40541a;
    }

    public final Pair<Boolean, List<String>> c(Context context) {
        String[] strArr;
        boolean z11;
        kotlin.jvm.internal.o.i(context, "<this>");
        ArrayList arrayList = new ArrayList();
        for (String str : this.f40542b) {
            if (androidx.core.content.b.checkSelfPermission(context, str) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                arrayList.add(str);
            }
        }
        return wz.i.a(Boolean.valueOf(arrayList.isEmpty()), arrayList);
    }

    public abstract void d(int i11, String[] strArr, int[] iArr, g00.l<? super List<String>, wz.p> lVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void e(g00.a<wz.p> aVar) {
        kotlin.jvm.internal.o.i(aVar, "<set-?>");
        this.f40543c = aVar;
    }

    public abstract void f(g00.p<? super List<String>, ? super g00.a<wz.p>, wz.p> pVar, g00.a<wz.p> aVar);
}
