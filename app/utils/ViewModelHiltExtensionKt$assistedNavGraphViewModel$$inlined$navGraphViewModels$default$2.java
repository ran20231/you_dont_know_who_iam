package com.forsale.app.utils;

import androidx.lifecycle.w0;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.Lambda;
/* compiled from: NavGraphViewModelLazy.kt */
/* loaded from: classes3.dex */
public final class ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$2 extends Lambda implements g00.a<w0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ wz.h f39689a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$2(wz.h hVar) {
        super(0);
        this.f39689a = hVar;
    }

    @Override // g00.a
    /* renamed from: b */
    public final w0 invoke() {
        NavBackStackEntry b11;
        b11 = z3.p.b(this.f39689a);
        return b11.getViewModelStore();
    }
}
