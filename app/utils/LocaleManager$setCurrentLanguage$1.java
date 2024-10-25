package com.forsale.app.utils;

import com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocaleManager.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.LocaleManager$setCurrentLanguage$1", f = "LocaleManager.kt", l = {46, 47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LocaleManager$setCurrentLanguage$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39611a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Languages f39612b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleManager$setCurrentLanguage$1(Languages languages, zz.a<? super LocaleManager$setCurrentLanguage$1> aVar) {
        super(2, aVar);
        this.f39612b = languages;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LocaleManager$setCurrentLanguage$1(this.f39612b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LocalizationSharedPrefs g11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39611a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            jj.b p11 = LocaleManager.f39597a.p();
            if (p11 != null && (g11 = p11.g()) != null) {
                String value = this.f39612b.getValue();
                this.f39611a = 1;
                if (g11.f(value, this) == f11) {
                    return f11;
                }
            }
        }
        MutableStateFlow mutableStateFlow = LocaleManager.f39600d;
        String value2 = this.f39612b.getValue();
        this.f39611a = 2;
        if (mutableStateFlow.emit(value2, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LocaleManager$setCurrentLanguage$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
