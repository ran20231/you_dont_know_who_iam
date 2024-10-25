package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import g00.l;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$2", f = "VerticalFragment.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onViewCreated$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23881a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23882b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$2$1", f = "VerticalFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Pair<? extends CategoryEntity, ? extends SubCategoriesPosition>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23883a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f23884b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23885c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalFragment verticalFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23885c = verticalFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<CategoryEntity, ? extends SubCategoriesPosition> pair, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pair, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23885c, aVar);
            anonymousClass1.f23884b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f23883a == 0) {
                f.b(obj);
                Pair pair = (Pair) this.f23884b;
                this.f23885c.w0((CategoryEntity) pair.c(), (SubCategoriesPosition) pair.d());
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onViewCreated$2(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onViewCreated$2> aVar) {
        super(1, aVar);
        this.f23882b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onViewCreated$2(this.f23882b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel k02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23881a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            k02 = this.f23882b.k0();
            SharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> M0 = k02.M0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23882b, null);
            this.f23881a = 1;
            if (FlowKt.collectLatest(M0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onViewCreated$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
