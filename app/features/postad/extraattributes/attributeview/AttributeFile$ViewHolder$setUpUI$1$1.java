package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: AttributeFile.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$1", f = "AttributeFile.kt", l = {l8.a.f62266c}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AttributeFile$ViewHolder$setUpUI$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35313a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeFile.ViewHolder f35314b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeFileViewModel f35315c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeFile.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$1$1", f = "AttributeFile.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeFileViewModel f35317b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AttributeFile.ViewHolder f35318c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeFile.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$1$1$1", f = "AttributeFile.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C04001 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35319a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AttributeFile.ViewHolder f35320b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AttributeFileViewModel f35321c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04001(AttributeFile.ViewHolder viewHolder, AttributeFileViewModel attributeFileViewModel, zz.a<? super C04001> aVar) {
                super(2, aVar);
                this.f35320b = viewHolder;
                this.f35321c = attributeFileViewModel;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C04001) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C04001(this.f35320b, this.f35321c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f35319a == 0) {
                    f.b(obj);
                    s j11 = this.f35320b.j();
                    x10.a.b("PLF-Attributes::chooseFileEvent collectLatest " + j11, new Object[0]);
                    if (this.f35320b.j() instanceof PostAdAttributesFragment) {
                        ((PostAdAttributesFragment) this.f35320b.j()).V(this.f35321c.i().getId());
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeFileViewModel attributeFileViewModel, AttributeFile.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35317b = attributeFileViewModel;
            this.f35318c = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35317b, this.f35318c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f35316a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<wz.p> k11 = this.f35317b.k();
                C04001 c04001 = new C04001(this.f35318c, this.f35317b, null);
                this.f35316a = 1;
                if (FlowKt.collectLatest(k11, c04001, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeFile$ViewHolder$setUpUI$1$1(AttributeFile.ViewHolder viewHolder, AttributeFileViewModel attributeFileViewModel, zz.a<? super AttributeFile$ViewHolder$setUpUI$1$1> aVar) {
        super(2, aVar);
        this.f35314b = viewHolder;
        this.f35315c = attributeFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeFile$ViewHolder$setUpUI$1$1(this.f35314b, this.f35315c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35313a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s j11 = this.f35314b.j();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35315c, this.f35314b, null);
            this.f35313a = 1;
            if (RepeatOnLifecycleKt.b(j11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeFile$ViewHolder$setUpUI$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
