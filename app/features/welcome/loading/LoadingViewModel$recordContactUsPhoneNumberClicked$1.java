package com.forsale.app.features.welcome.loading;

import com.forsale.app.analytics.base.ForSaleDataTracker;
import com.forsale.app.features.welcome.loading.analytics.ContactUsAnalyticsEvent;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$recordContactUsPhoneNumberClicked$1", f = "LoadingViewModel.kt", l = {351}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$recordContactUsPhoneNumberClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37289a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37290b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f37291c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$recordContactUsPhoneNumberClicked$1(LoadingViewModel loadingViewModel, String str, zz.a<? super LoadingViewModel$recordContactUsPhoneNumberClicked$1> aVar) {
        super(2, aVar);
        this.f37290b = loadingViewModel;
        this.f37291c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$recordContactUsPhoneNumberClicked$1(this.f37290b, this.f37291c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ForSaleDataTracker forSaleDataTracker;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37289a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            forSaleDataTracker = this.f37290b.f37217z;
            ContactUsAnalyticsEvent contactUsAnalyticsEvent = new ContactUsAnalyticsEvent(this.f37291c);
            this.f37289a = 1;
            if (forSaleDataTracker.a(contactUsAnalyticsEvent, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$recordContactUsPhoneNumberClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
