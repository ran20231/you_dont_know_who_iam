package com.forsale.app.features.categories.home.maincategories;

import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainCategoriesFragment.kt */
@d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$4", f = "MainCategoriesFragment.kt", l = {390}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainCategoriesFragment$bindObservers$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24339a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainCategoriesFragment f24340b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainCategoriesFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$4$1", f = "MainCategoriesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Integer, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24341a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f24342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainCategoriesFragment f24343c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainCategoriesFragment mainCategoriesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f24343c = mainCategoriesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24343c, aVar);
            anonymousClass1.f24342b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f24341a == 0) {
                f.b(obj);
                MainCategoriesFragment.g0(this.f24343c, this.f24342b, AnalyticsDetailsSource.DEEP_LINK, null, 4, null);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, zz.a<? super p> aVar) {
            return invoke(num.intValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesFragment$bindObservers$4(MainCategoriesFragment mainCategoriesFragment, zz.a<? super MainCategoriesFragment$bindObservers$4> aVar) {
        super(1, aVar);
        this.f24340b = mainCategoriesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MainCategoriesFragment$bindObservers$4(this.f24340b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel b02;
        f11 = b.f();
        int i11 = this.f24339a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            b02 = this.f24340b.b0();
            SharedFlow<Integer> K0 = b02.K0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24340b, null);
            this.f24339a = 1;
            if (FlowKt.collectLatest(K0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MainCategoriesFragment$bindObservers$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
