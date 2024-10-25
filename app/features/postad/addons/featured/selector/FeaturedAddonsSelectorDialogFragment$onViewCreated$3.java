package com.forsale.app.features.postad.addons.featured.selector;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: FeaturedAddonsSelectorDialogFragment.kt */
@d(c = "com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$onViewCreated$3", f = "FeaturedAddonsSelectorDialogFragment.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FeaturedAddonsSelectorDialogFragment$onViewCreated$3 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34753a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonsSelectorDialogFragment f34754b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeaturedAddonsSelectorDialogFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$onViewCreated$3$1", f = "FeaturedAddonsSelectorDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$onViewCreated$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34755a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeaturedAddonsSelectorDialogFragment f34756b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FeaturedAddonsSelectorDialogFragment featuredAddonsSelectorDialogFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34756b = featuredAddonsSelectorDialogFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34756b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34755a == 0) {
                f.b(obj);
                this.f34756b.dismiss();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAddonsSelectorDialogFragment$onViewCreated$3(FeaturedAddonsSelectorDialogFragment featuredAddonsSelectorDialogFragment, zz.a<? super FeaturedAddonsSelectorDialogFragment$onViewCreated$3> aVar) {
        super(1, aVar);
        this.f34754b = featuredAddonsSelectorDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new FeaturedAddonsSelectorDialogFragment$onViewCreated$3(this.f34754b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34753a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> A0 = this.f34754b.y().A0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34754b, null);
            this.f34753a = 1;
            if (FlowKt.collectLatest(A0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((FeaturedAddonsSelectorDialogFragment$onViewCreated$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
