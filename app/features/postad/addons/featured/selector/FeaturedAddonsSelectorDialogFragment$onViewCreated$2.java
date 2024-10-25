package com.forsale.app.features.postad.addons.featured.selector;

import com.forsale.app.datalayer.network.responses.Addon;
import g00.l;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: FeaturedAddonsSelectorDialogFragment.kt */
@d(c = "com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$onViewCreated$2", f = "FeaturedAddonsSelectorDialogFragment.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FeaturedAddonsSelectorDialogFragment$onViewCreated$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34748a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonsSelectorDialogFragment f34749b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeaturedAddonsSelectorDialogFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$onViewCreated$2$1", f = "FeaturedAddonsSelectorDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$onViewCreated$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Set<? extends Addon>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34750a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f34751b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FeaturedAddonsSelectorDialogFragment f34752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FeaturedAddonsSelectorDialogFragment featuredAddonsSelectorDialogFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34752c = featuredAddonsSelectorDialogFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Set<Addon> set, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(set, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34752c, aVar);
            anonymousClass1.f34751b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l lVar;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34750a == 0) {
                f.b(obj);
                Set set = (Set) this.f34751b;
                if (set != null) {
                    lVar = this.f34752c.f34730f;
                    lVar.invoke(set);
                }
                this.f34752c.dismiss();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAddonsSelectorDialogFragment$onViewCreated$2(FeaturedAddonsSelectorDialogFragment featuredAddonsSelectorDialogFragment, zz.a<? super FeaturedAddonsSelectorDialogFragment$onViewCreated$2> aVar) {
        super(1, aVar);
        this.f34749b = featuredAddonsSelectorDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new FeaturedAddonsSelectorDialogFragment$onViewCreated$2(this.f34749b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34748a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Set<Addon>> B0 = this.f34749b.y().B0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34749b, null);
            this.f34748a = 1;
            if (FlowKt.collectLatest(B0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((FeaturedAddonsSelectorDialogFragment$onViewCreated$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
