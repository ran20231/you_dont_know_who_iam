package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import b2.f;
import com.forsale.designSystem.TextKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: State.kt */
/* loaded from: classes3.dex */
final class StateKt$State$3 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42407a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42408b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateKt$State$3(String str, int i11) {
        super(2);
        this.f42407a = str;
        this.f42408b = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1820399977, i11, -1, "com.forsale.ui.components.State.<anonymous> (State.kt:30)");
        }
        TextKt.a(this.f42407a, null, f.f16081b.a(), 0, false, 0, 0, null, null, 0L, 0, aVar, (this.f42408b >> 9) & 14, 0, 2042);
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
