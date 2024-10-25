package com.forsale.app.utils;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocaleManager.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.LocaleManager$setCurrentLanguageIfNotSet$1", f = "LocaleManager.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LocaleManager$setCurrentLanguageIfNotSet$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39617a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Languages f39618b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleManager$setCurrentLanguageIfNotSet$1(Languages languages, zz.a<? super LocaleManager$setCurrentLanguageIfNotSet$1> aVar) {
        super(2, aVar);
        this.f39618b = languages;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LocaleManager$setCurrentLanguageIfNotSet$1(this.f39618b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39617a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            LocaleManager localeManager = LocaleManager.f39597a;
            this.f39617a = 1;
            obj = localeManager.f(this);
            if (obj == f11) {
                return f11;
            }
        }
        if (obj == null) {
            LocaleManager.f39597a.v(this.f39618b);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LocaleManager$setCurrentLanguageIfNotSet$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
