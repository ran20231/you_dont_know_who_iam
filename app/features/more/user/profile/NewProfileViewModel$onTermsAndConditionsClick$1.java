package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okhttp3.internal.http.StatusLine;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onTermsAndConditionsClick$1", f = "NewProfileViewModel.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onTermsAndConditionsClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33631a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33632b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onTermsAndConditionsClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onTermsAndConditionsClick$1> aVar) {
        super(2, aVar);
        this.f33632b = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onTermsAndConditionsClick$1(this.f33632b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33631a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33632b.C;
            j jVar = j.f33699a;
            this.f33631a = 1;
            if (mutableSharedFlow.emit(jVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onTermsAndConditionsClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
