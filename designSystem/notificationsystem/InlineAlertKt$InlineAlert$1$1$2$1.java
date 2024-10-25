package com.forsale.designSystem.notificationsystem;

import androidx.compose.runtime.c;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: InlineAlert.kt */
/* loaded from: classes3.dex */
final class InlineAlertKt$InlineAlert$1$1$2$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41924a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41925b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InlineAlertKt$InlineAlert$1$1$2$1(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f41924a = pVar;
        this.f41925b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(507533060, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlert.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InlineAlert.kt:97)");
        }
        this.f41924a.invoke(aVar, Integer.valueOf((this.f41925b >> 9) & 14));
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
