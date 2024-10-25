package com.forsale.ui.components.material3;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.l;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Switch.kt */
/* loaded from: classes3.dex */
public final class SwitchKt$Switch$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42709a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f42710b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<Boolean, wz.p> f42711c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f42712d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42713e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42714f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchKt$Switch$2(c cVar, boolean z11, l<? super Boolean, wz.p> lVar, boolean z12, int i11, int i12) {
        super(2);
        this.f42709a = cVar;
        this.f42710b = z11;
        this.f42711c = lVar;
        this.f42712d = z12;
        this.f42713e = i11;
        this.f42714f = i12;
    }

    public final void b(a aVar, int i11) {
        SwitchKt.a(this.f42709a, this.f42710b, this.f42711c, this.f42712d, aVar, v0.a(this.f42713e | 1), this.f42714f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
