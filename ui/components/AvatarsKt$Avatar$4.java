package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* compiled from: Avatars.kt */
/* loaded from: classes3.dex */
final class AvatarsKt$Avatar$4 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42232a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarsKt$Avatar$4(String str) {
        super(2);
        this.f42232a = str;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1879086444, i11, -1, "com.forsale.ui.components.Avatar.<anonymous> (Avatars.kt:59)");
        }
        String substring = this.f42232a.substring(0, 1);
        o.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        TextKt.a(substring, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 0, 0, 2046);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
