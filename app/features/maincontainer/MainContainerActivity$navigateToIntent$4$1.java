package com.forsale.app.features.maincontainer;

import android.content.Intent;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$navigateToIntent$4$1", f = "MainContainerActivity.kt", l = {492}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$navigateToIntent$4$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31401a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31402b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f31403c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Intent f31404d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$navigateToIntent$4$1(MainContainerActivity mainContainerActivity, String str, Intent intent, zz.a<? super MainContainerActivity$navigateToIntent$4$1> aVar) {
        super(2, aVar);
        this.f31402b = mainContainerActivity;
        this.f31403c = str;
        this.f31404d = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$navigateToIntent$4$1(this.f31402b, this.f31403c, this.f31404d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31401a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            String it2 = this.f31403c;
            o.h(it2, "$it");
            Intent intent = this.f31404d;
            MainContainerActivity mainContainerActivity = this.f31402b;
            this.f31401a = 1;
            if (this.f31402b.n1().get().a(it2, intent, mainContainerActivity, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$navigateToIntent$4$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
