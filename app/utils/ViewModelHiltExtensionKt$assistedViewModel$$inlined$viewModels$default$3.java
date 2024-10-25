package com.forsale.app.utils;

import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Lambda;
/* compiled from: ActivityViewModelLazy.kt */
/* loaded from: classes3.dex */
public final class ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3 extends Lambda implements g00.a<w3.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a f39693a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ComponentActivity f39694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3(g00.a aVar, ComponentActivity componentActivity) {
        super(0);
        this.f39693a = aVar;
        this.f39694b = componentActivity;
    }

    @Override // g00.a
    /* renamed from: b */
    public final w3.a invoke() {
        w3.a aVar;
        g00.a aVar2 = this.f39693a;
        if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
            return this.f39694b.getDefaultViewModelCreationExtras();
        }
        return aVar;
    }
}
