package com.forsale.app.utils;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ActivityViewModelLazy.kt */
/* loaded from: classes3.dex */
public final class ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2 extends Lambda implements g00.a<w0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComponentActivity f39692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(ComponentActivity componentActivity) {
        super(0);
        this.f39692a = componentActivity;
    }

    @Override // g00.a
    /* renamed from: b */
    public final w0 invoke() {
        return this.f39692a.getViewModelStore();
    }
}
