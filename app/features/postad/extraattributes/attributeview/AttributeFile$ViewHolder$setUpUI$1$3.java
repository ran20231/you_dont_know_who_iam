package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile;
import g00.p;
import java.io.File;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeFile.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$3", f = "AttributeFile.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeFile$ViewHolder$setUpUI$1$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35330a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeFile.ViewHolder f35331b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeFileViewModel f35332c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeFile.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$3$1", f = "AttributeFile.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeFileViewModel f35334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AttributeFile.ViewHolder f35335c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeFile.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$3$1$1", f = "AttributeFile.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C04021 extends SuspendLambda implements p<File, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35336a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f35337b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AttributeFileViewModel f35338c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AttributeFile.ViewHolder f35339d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04021(AttributeFileViewModel attributeFileViewModel, AttributeFile.ViewHolder viewHolder, zz.a<? super C04021> aVar) {
                super(2, aVar);
                this.f35338c = attributeFileViewModel;
                this.f35339d = viewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(File file, zz.a<? super wz.p> aVar) {
                return ((C04021) create(file, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C04021 c04021 = new C04021(this.f35338c, this.f35339d, aVar);
                c04021.f35337b = obj;
                return c04021;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f35336a == 0) {
                    f.b(obj);
                    if (((File) this.f35337b) != null) {
                        this.f35338c.A();
                        this.f35339d.m();
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeFileViewModel attributeFileViewModel, AttributeFile.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35334b = attributeFileViewModel;
            this.f35335c = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35334b, this.f35335c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f35333a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                StateFlow<File> t11 = this.f35334b.t();
                C04021 c04021 = new C04021(this.f35334b, this.f35335c, null);
                this.f35333a = 1;
                if (FlowKt.collectLatest(t11, c04021, this) == f11) {
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
    public AttributeFile$ViewHolder$setUpUI$1$3(AttributeFile.ViewHolder viewHolder, AttributeFileViewModel attributeFileViewModel, zz.a<? super AttributeFile$ViewHolder$setUpUI$1$3> aVar) {
        super(2, aVar);
        this.f35331b = viewHolder;
        this.f35332c = attributeFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeFile$ViewHolder$setUpUI$1$3(this.f35331b, this.f35332c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35330a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s j11 = this.f35331b.j();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35332c, this.f35331b, null);
            this.f35330a = 1;
            if (RepeatOnLifecycleKt.b(j11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeFile$ViewHolder$setUpUI$1$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
