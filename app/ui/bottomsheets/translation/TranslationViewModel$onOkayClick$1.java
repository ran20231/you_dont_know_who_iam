package com.forsale.app.ui.bottomsheets.translation;

import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TranslationViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.translation.TranslationViewModel$onOkayClick$1", f = "TranslationViewModel.kt", l = {47, 48}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TranslationViewModel$onOkayClick$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f39153a;

    /* renamed from: b  reason: collision with root package name */
    Object f39154b;

    /* renamed from: c  reason: collision with root package name */
    Object f39155c;

    /* renamed from: d  reason: collision with root package name */
    int f39156d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ TranslationViewModel f39157e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationViewModel$onOkayClick$1(TranslationViewModel translationViewModel, a<? super TranslationViewModel$onOkayClick$1> aVar) {
        super(2, aVar);
        this.f39157e = translationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new TranslationViewModel$onOkayClick$1(this.f39157e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        TranslationRepository.Translation D0;
        TranslationRepository translationRepository;
        TranslationRepository.Translation translation;
        TranslationViewModel translationViewModel;
        f11 = b.f();
        int i11 = this.f39156d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    translationViewModel = (TranslationViewModel) this.f39155c;
                    translation = (TranslationRepository.Translation) this.f39154b;
                    TranslationRepository.Translation translation2 = (TranslationRepository.Translation) this.f39153a;
                    f.b(obj);
                    translationViewModel.E0((TranslationRepository.Translation) obj, translation);
                    OneShotEventHandler<wz.p> C0 = this.f39157e.C0();
                    wz.p pVar = wz.p.f75480a;
                    C0.i(pVar);
                    return pVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            translation = (TranslationRepository.Translation) this.f39153a;
            f.b(obj);
        } else {
            f.b(obj);
            TranslationViewModel translationViewModel2 = this.f39157e;
            D0 = translationViewModel2.D0(translationViewModel2.A0().j());
            translationRepository = this.f39157e.f39136k0;
            this.f39153a = D0;
            this.f39156d = 1;
            if (translationRepository.setCurrentTranslation(D0, this) == f11) {
                return f11;
            }
            translation = D0;
        }
        TranslationViewModel translationViewModel3 = this.f39157e;
        this.f39153a = translation;
        this.f39154b = translation;
        this.f39155c = translationViewModel3;
        this.f39156d = 2;
        Object z02 = translationViewModel3.z0(this);
        if (z02 == f11) {
            return f11;
        }
        translationViewModel = translationViewModel3;
        obj = z02;
        translationViewModel.E0((TranslationRepository.Translation) obj, translation);
        OneShotEventHandler<wz.p> C02 = this.f39157e.C0();
        wz.p pVar2 = wz.p.f75480a;
        C02.i(pVar2);
        return pVar2;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((TranslationViewModel$onOkayClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
