package com.forsale.designSystem.avatars;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: Avatars.kt */
/* loaded from: classes3.dex */
final class AvatarsKt$Avatar$2$1$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f40756a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f40757b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AvatarsKt$Avatar$2$1$1(p<? super a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f40756a = pVar;
        this.f40757b = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1795174278, i11, -1, "com.forsale.designSystem.avatars.Avatar.<anonymous>.<anonymous>.<anonymous> (Avatars.kt:61)");
        }
        this.f40756a.invoke(aVar, Integer.valueOf((this.f40757b >> 3) & 14));
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
