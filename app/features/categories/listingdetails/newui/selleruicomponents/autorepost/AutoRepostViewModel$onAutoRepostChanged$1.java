package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoRepostViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostViewModel$onAutoRepostChanged$1", f = "AutoRepostViewModel.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AutoRepostViewModel$onAutoRepostChanged$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27730a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AutoRepostViewModel f27731b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRepostViewModel$onAutoRepostChanged$1(AutoRepostViewModel autoRepostViewModel, a<? super AutoRepostViewModel$onAutoRepostChanged$1> aVar) {
        super(2, aVar);
        this.f27731b = autoRepostViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AutoRepostViewModel$onAutoRepostChanged$1(this.f27731b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition;
        f11 = b.f();
        int i11 = this.f27730a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f27731b.f27721f;
            analyticsPosition = this.f27731b.f27718c;
            this.f27730a = 1;
            if (mutableSharedFlow.emit(analyticsPosition, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AutoRepostViewModel$onAutoRepostChanged$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
