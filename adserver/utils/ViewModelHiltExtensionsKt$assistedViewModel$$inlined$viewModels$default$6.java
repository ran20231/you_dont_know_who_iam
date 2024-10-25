package com.forsale.adserver.utils;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.jvm.internal.Lambda;
import wz.h;
/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes2.dex */
public final class ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$6 extends Lambda implements g00.a<w0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f20869a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$6(h hVar) {
        super(0);
        this.f20869a = hVar;
    }

    @Override // g00.a
    /* renamed from: b */
    public final w0 invoke() {
        x0 c11;
        c11 = FragmentViewModelLazyKt.c(this.f20869a);
        return c11.getViewModelStore();
    }
}
