package com.forsale.app.features.categories.home.maincategories;

import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.features.categories.listingdetails.ListingDetailsOwnerActions;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import g00.l;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainCategoriesFragment.kt */
@d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$5", f = "MainCategoriesFragment.kt", l = {395}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainCategoriesFragment$bindObservers$5 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24344a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainCategoriesFragment f24345b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainCategoriesFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$5$1", f = "MainCategoriesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$5$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Pair<? extends Integer, ? extends ListingDetailsOwnerActions>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24346a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f24347b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainCategoriesFragment f24348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainCategoriesFragment mainCategoriesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f24348c = mainCategoriesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<Integer, ? extends ListingDetailsOwnerActions> pair, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pair, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24348c, aVar);
            anonymousClass1.f24347b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f24346a == 0) {
                f.b(obj);
                Pair pair = (Pair) this.f24347b;
                this.f24348c.f0(((Number) pair.c()).intValue(), AnalyticsDetailsSource.DEEP_LINK, (ListingDetailsOwnerActions) pair.d());
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesFragment$bindObservers$5(MainCategoriesFragment mainCategoriesFragment, zz.a<? super MainCategoriesFragment$bindObservers$5> aVar) {
        super(1, aVar);
        this.f24345b = mainCategoriesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MainCategoriesFragment$bindObservers$5(this.f24345b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel b02;
        f11 = b.f();
        int i11 = this.f24344a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            b02 = this.f24345b.b0();
            SharedFlow<Pair<Integer, ListingDetailsOwnerActions>> L0 = b02.L0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24345b, null);
            this.f24344a = 1;
            if (FlowKt.collectLatest(L0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MainCategoriesFragment$bindObservers$5) create(aVar)).invokeSuspend(p.f75480a);
    }
}
