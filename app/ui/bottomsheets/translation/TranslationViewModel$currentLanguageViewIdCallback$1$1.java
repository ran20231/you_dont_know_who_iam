package com.forsale.app.ui.bottomsheets.translation;

import androidx.databinding.ObservableBoolean;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: TranslationViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.translation.TranslationViewModel$currentLanguageViewIdCallback$1$1", f = "TranslationViewModel.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TranslationViewModel$currentLanguageViewIdCallback$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f39145a;

    /* renamed from: b  reason: collision with root package name */
    Object f39146b;

    /* renamed from: c  reason: collision with root package name */
    int f39147c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TranslationViewModel f39148d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationViewModel$currentLanguageViewIdCallback$1$1(TranslationViewModel translationViewModel, a<? super TranslationViewModel$currentLanguageViewIdCallback$1$1> aVar) {
        super(2, aVar);
        this.f39148d = translationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new TranslationViewModel$currentLanguageViewIdCallback$1$1(this.f39148d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        TranslationRepository.Translation D0;
        ObservableBoolean observableBoolean;
        f11 = b.f();
        int i11 = this.f39147c;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                observableBoolean = (ObservableBoolean) this.f39146b;
                D0 = (TranslationRepository.Translation) this.f39145a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            TranslationViewModel translationViewModel = this.f39148d;
            D0 = translationViewModel.D0(translationViewModel.A0().j());
            ObservableBoolean B0 = this.f39148d.B0();
            TranslationViewModel translationViewModel2 = this.f39148d;
            this.f39145a = D0;
            this.f39146b = B0;
            this.f39147c = 1;
            Object z02 = translationViewModel2.z0(this);
            if (z02 == f11) {
                return f11;
            }
            observableBoolean = B0;
            obj = z02;
        }
        if (obj == D0) {
            z11 = false;
        }
        observableBoolean.k(z11);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((TranslationViewModel$currentLanguageViewIdCallback$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
