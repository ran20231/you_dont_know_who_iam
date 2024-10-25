package com.forsale.app.features.categories.home.maincategories;

import com.forsale.adserver.view.models.AdsModel;
import com.forsale.app.datalayer.network.errorhandling.ErrorCodes;
import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainCategoriesFragment.kt */
@d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$6", f = "MainCategoriesFragment.kt", l = {ErrorCodes.UNAUTHORIZED_ERROR_CODE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainCategoriesFragment$bindObservers$6 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24349a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainCategoriesFragment f24350b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainCategoriesFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$6$1", f = "MainCategoriesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<AdsModel, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24351a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f24352b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainCategoriesFragment f24353c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainCategoriesFragment mainCategoriesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f24353c = mainCategoriesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(AdsModel adsModel, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(adsModel, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24353c, aVar);
            anonymousClass1.f24352b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f24351a == 0) {
                f.b(obj);
                AdsModel adsModel = (AdsModel) this.f24352b;
                if (this.f24353c.getActivity() instanceof MainContainerActivity) {
                    androidx.fragment.app.p activity = this.f24353c.getActivity();
                    o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.maincontainer.MainContainerActivity");
                    MainContainerActivity.O1((MainContainerActivity) activity, null, adsModel, false, 5, null);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesFragment$bindObservers$6(MainCategoriesFragment mainCategoriesFragment, zz.a<? super MainCategoriesFragment$bindObservers$6> aVar) {
        super(1, aVar);
        this.f24350b = mainCategoriesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MainCategoriesFragment$bindObservers$6(this.f24350b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel b02;
        f11 = b.f();
        int i11 = this.f24349a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            b02 = this.f24350b.b0();
            SharedFlow<AdsModel> I0 = b02.I0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24350b, null);
            this.f24349a = 1;
            if (FlowKt.collectLatest(I0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MainCategoriesFragment$bindObservers$6) create(aVar)).invokeSuspend(p.f75480a);
    }
}
