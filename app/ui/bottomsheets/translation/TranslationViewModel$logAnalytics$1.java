package com.forsale.app.ui.bottomsheets.translation;

import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.TranslationAWS;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import l8.a;
/* compiled from: TranslationViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.translation.TranslationViewModel$logAnalytics$1", f = "TranslationViewModel.kt", l = {a.f62267d}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TranslationViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39149a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TranslationViewModel f39150b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TranslationRepository.Translation f39151c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TranslationRepository.Translation f39152d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationViewModel$logAnalytics$1(TranslationViewModel translationViewModel, TranslationRepository.Translation translation, TranslationRepository.Translation translation2, zz.a<? super TranslationViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f39150b = translationViewModel;
        this.f39151c = translation;
        this.f39152d = translation2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new TranslationViewModel$logAnalytics$1(this.f39150b, this.f39151c, this.f39152d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f39149a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AggregatedAllAnalyticsLogger r11 = this.f39150b.r();
            TranslationAWS.a aVar = TranslationAWS.Companion;
            String value = aVar.a(this.f39151c).getValue();
            String value2 = aVar.a(this.f39152d).getValue();
            this.f39149a = 1;
            if (AggregatedAllAnalyticsLoggerKt.K0(r11, value, value2, true, true, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((TranslationViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
