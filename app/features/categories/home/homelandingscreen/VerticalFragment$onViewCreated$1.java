package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$1", f = "VerticalFragment.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onViewCreated$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23860a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23861b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$1$1", f = "VerticalFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CategoryEntity, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23862a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f23863b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalFragment verticalFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23864c = verticalFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(CategoryEntity categoryEntity, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(categoryEntity, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23864c, aVar);
            anonymousClass1.f23863b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f23862a == 0) {
                f.b(obj);
                this.f23864c.B().e1(true, (CategoryEntity) this.f23863b);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onViewCreated$1(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onViewCreated$1> aVar) {
        super(1, aVar);
        this.f23861b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onViewCreated$1(this.f23861b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel k02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23860a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            k02 = this.f23861b.k0();
            SharedFlow<CategoryEntity> N0 = k02.N0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23861b, null);
            this.f23860a = 1;
            if (FlowKt.collectLatest(N0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onViewCreated$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
