package com.forsale.app.utils;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.jvm.internal.Lambda;
/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes3.dex */
public final class ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6 extends Lambda implements g00.a<w0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ wz.h f39697a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(wz.h hVar) {
        super(0);
        this.f39697a = hVar;
    }

    @Override // g00.a
    /* renamed from: b */
    public final w0 invoke() {
        x0 c11;
        c11 = FragmentViewModelLazyKt.c(this.f39697a);
        return c11.getViewModelStore();
    }
}
