package com.forsale.designSystem.colors;

import com.google.logging.type.LogSeverity;
import f00.b;
import g00.a;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import sj.c;
import wz.h;
import wz.i;
import yj.d;
/* compiled from: values.kt */
@b
/* loaded from: classes3.dex */
public final class Error {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: values.kt */
    /* renamed from: com.forsale.designSystem.colors.Error$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements a<Map<Integer, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final AnonymousClass1 f41312a = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // g00.a
        public final Map<Integer, ? extends Integer> invoke() {
            Map<Integer, ? extends Integer> k11;
            k11 = j0.k(i.a(50, Integer.valueOf(c.f68652o)), i.a(100, Integer.valueOf(c.f68648k)), i.a(Integer.valueOf((int) LogSeverity.INFO_VALUE), Integer.valueOf(c.f68649l)), i.a(300, Integer.valueOf(c.f68650m)), i.a(400, Integer.valueOf(c.f68651n)), i.a(Integer.valueOf((int) LogSeverity.ERROR_VALUE), Integer.valueOf(c.f68653p)), i.a(Integer.valueOf((int) LogSeverity.CRITICAL_VALUE), Integer.valueOf(c.f68654q)), i.a(Integer.valueOf((int) LogSeverity.ALERT_VALUE), Integer.valueOf(c.f68655r)), i.a(Integer.valueOf((int) LogSeverity.EMERGENCY_VALUE), Integer.valueOf(c.f68656s)), i.a(900, Integer.valueOf(c.f68657t)));
            return k11;
        }
    }

    public static d a(d color) {
        o.i(color, "color");
        return color;
    }

    public static /* synthetic */ d b(d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        h a11;
        if ((i11 & 1) != 0) {
            a11 = kotlin.d.a(AnonymousClass1.f41312a);
            dVar = new d(a11);
        }
        return a(dVar);
    }
}
