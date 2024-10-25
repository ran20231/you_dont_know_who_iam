package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.ErrorHandlingExtensionsKt;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadSubCategoriesAsync$1", f = "VerticalViewModel.kt", l = {343}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$loadSubCategoriesAsync$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Throwable>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24038a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f24039b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f24040c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f24041d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalViewModel.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadSubCategoriesAsync$1$1", f = "VerticalViewModel.kt", l = {344, 347, 348}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadSubCategoriesAsync$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements l<zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24042a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerticalViewModel f24043b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategoryEntity f24044c;

        /* compiled from: VerticalViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadSubCategoriesAsync$1$1$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f24045a;

            static {
                int[] iArr = new int[CategoryEntity.Classification.values().length];
                try {
                    iArr[CategoryEntity.Classification.Services.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f24045a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalViewModel verticalViewModel, CategoryEntity categoryEntity, zz.a<? super AnonymousClass1> aVar) {
            super(1, aVar);
            this.f24043b = verticalViewModel;
            this.f24044c = categoryEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(zz.a<?> aVar) {
            return new AnonymousClass1(this.f24043b, this.f24044c, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r6.f24042a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.f.b(r7)
                goto L94
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                kotlin.f.b(r7)
                goto L71
            L22:
                kotlin.f.b(r7)
                goto L3e
            L26:
                kotlin.f.b(r7)
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r7 = r6.f24043b
                com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository r7 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.K0(r7)
                com.forsale.app.datalayer.database.CategoryEntity r1 = r6.f24044c
                int r1 = r1.getId()
                r6.f24042a = r4
                java.lang.Object r7 = r7.d(r1, r6)
                if (r7 != r0) goto L3e
                return r0
            L3e:
                java.util.List r7 = (java.util.List) r7
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r1 = r6.f24043b
                androidx.lifecycle.LiveData r1 = r1.g1()
                java.lang.Object r1 = r1.getValue()
                com.forsale.app.datalayer.database.CategoryEntity r1 = (com.forsale.app.datalayer.database.CategoryEntity) r1
                if (r1 == 0) goto L53
                com.forsale.app.datalayer.database.CategoryEntity$Classification r1 = r1.getClassification()
                goto L54
            L53:
                r1 = 0
            L54:
                if (r1 != 0) goto L58
                r1 = -1
                goto L60
            L58:
                int[] r5 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadSubCategoriesAsync$1.AnonymousClass1.a.f24045a
                int r1 = r1.ordinal()
                r1 = r5[r1]
            L60:
                if (r1 != r4) goto L85
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r1 = r6.f24043b
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.J0(r1)
                r6.f24042a = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L71
                return r0
            L71:
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r7 = r6.f24043b
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.V0(r7)
                r1 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
                r6.f24042a = r2
                java.lang.Object r7 = r7.emit(r1, r6)
                if (r7 != r0) goto L94
                return r0
            L85:
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r0 = r6.f24043b
                java.util.List r7 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.Y0(r0, r7)
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r0 = r6.f24043b
                androidx.lifecycle.b0 r0 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.I0(r0)
                r0.postValue(r7)
            L94:
                wz.p r7 = wz.p.f75480a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadSubCategoriesAsync$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.l
        public final Object invoke(zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$loadSubCategoriesAsync$1(boolean z11, VerticalViewModel verticalViewModel, CategoryEntity categoryEntity, zz.a<? super VerticalViewModel$loadSubCategoriesAsync$1> aVar) {
        super(2, aVar);
        this.f24039b = z11;
        this.f24040c = verticalViewModel;
        this.f24041d = categoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$loadSubCategoriesAsync$1(this.f24039b, this.f24040c, this.f24041d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24038a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            boolean z11 = this.f24039b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24040c, this.f24041d, null);
            this.f24038a = 1;
            obj = ErrorHandlingExtensionsKt.b(z11, anonymousClass1, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Throwable> aVar) {
        return ((VerticalViewModel$loadSubCategoriesAsync$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
