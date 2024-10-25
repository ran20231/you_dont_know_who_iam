package com.forsale.designSystem.checkboxes;

import androidx.compose.runtime.c;
import b1.t1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Checkboxes.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41244a = new a();

    private a() {
    }

    public final wj.a a(long j11, long j12, long j13, long j14, long j15, long j16, androidx.compose.runtime.a aVar, int i11, int i12) {
        long j17;
        long j18;
        long j19;
        long j21;
        long j22;
        long j23;
        aVar.C(-1011152508);
        if ((i12 & 1) != 0) {
            j17 = dk.a.f54291a.a(aVar, 6).f().i(aVar, 0);
        } else {
            j17 = j11;
        }
        if ((i12 & 2) != 0) {
            j18 = t1.f15974b.f();
        } else {
            j18 = j12;
        }
        if ((i12 & 4) != 0) {
            j19 = t1.f15974b.f();
        } else {
            j19 = j13;
        }
        if ((i12 & 8) != 0) {
            j21 = dk.a.f54291a.a(aVar, 6).e().e(aVar, 0);
        } else {
            j21 = j14;
        }
        if ((i12 & 16) != 0) {
            j22 = dk.a.f54291a.a(aVar, 6).e().f(aVar, 0);
        } else {
            j22 = j15;
        }
        if ((i12 & 32) != 0) {
            j23 = dk.a.f54291a.a(aVar, 6).e().g(aVar, 0);
        } else {
            j23 = j16;
        }
        if (c.I()) {
            c.U(-1011152508, i11, -1, "com.forsale.designSystem.checkboxes.CheckboxDefaults.colors (Checkboxes.kt:219)");
        }
        Object[] objArr = {t1.g(j17), t1.g(j18), t1.g(j19), t1.g(j21), t1.g(j22)};
        aVar.C(-568225417);
        boolean z11 = false;
        for (int i13 = 0; i13 < 5; i13++) {
            z11 |= aVar.T(objArr[i13]);
        }
        Object D = aVar.D();
        if (z11 || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new b(j17, t1.o(j17, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j19, j21, j22, j23, null);
            aVar.u(D);
        }
        aVar.S();
        b bVar = (b) D;
        if (c.I()) {
            c.T();
        }
        aVar.S();
        return bVar;
    }
}
