package com.forsale.app.features.categories.home.maincategories;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
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
@d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$2", f = "MainCategoriesFragment.kt", l = {379}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainCategoriesFragment$bindObservers$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24329a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainCategoriesFragment f24330b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainCategoriesFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$2$1", f = "MainCategoriesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Pair<? extends CategoryEntity, ? extends SubCategoriesPosition>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24331a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f24332b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainCategoriesFragment f24333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainCategoriesFragment mainCategoriesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f24333c = mainCategoriesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<CategoryEntity, ? extends SubCategoriesPosition> pair, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pair, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24333c, aVar);
            anonymousClass1.f24332b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f24331a == 0) {
                f.b(obj);
                Pair pair = (Pair) this.f24332b;
                this.f24333c.j0((CategoryEntity) pair.c(), (SubCategoriesPosition) pair.d());
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesFragment$bindObservers$2(MainCategoriesFragment mainCategoriesFragment, zz.a<? super MainCategoriesFragment$bindObservers$2> aVar) {
        super(1, aVar);
        this.f24330b = mainCategoriesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MainCategoriesFragment$bindObservers$2(this.f24330b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel b02;
        f11 = b.f();
        int i11 = this.f24329a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            b02 = this.f24330b.b0();
            SharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> M0 = b02.M0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24330b, null);
            this.f24329a = 1;
            if (FlowKt.collectLatest(M0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MainCategoriesFragment$bindObservers$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
