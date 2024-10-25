package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.z;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.app.utils.OneShotEventHandler;
import g00.l;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import wz.e;
/* compiled from: AttributesViewModel.kt */
@SuppressLint({"SuspiciousIndentation"})
/* loaded from: classes2.dex */
public final class AttributesViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final LiveData<TranslationRepository.Translation> f27484a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineScope f27485b;

    /* renamed from: c  reason: collision with root package name */
    private final z<List<AttributeItemViewModel>> f27486c;

    /* renamed from: d  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f27487d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<List<AttributeItemViewModel>> f27488e;

    /* renamed from: f  reason: collision with root package name */
    private final z<MoreButtonState> f27489f;

    /* renamed from: g  reason: collision with root package name */
    private final b0<CategoryEntity> f27490g;

    /* renamed from: h  reason: collision with root package name */
    private final b0<CategoryEntity> f27491h;

    /* renamed from: i  reason: collision with root package name */
    private final z<String> f27492i;

    /* renamed from: j  reason: collision with root package name */
    private final z<String> f27493j;

    /* compiled from: AttributesViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel$4", f = "AttributesViewModel.kt", l = {l8.a.f62266c, 55, 58}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass4 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f27497a;

        /* renamed from: b  reason: collision with root package name */
        int f27498b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f27499c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CategoryDao f27500d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f27501e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AttributesViewModel f27502f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributesViewModel.kt */
        @d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel$4$1", f = "AttributesViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel$4$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f27503a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AttributesViewModel f27504b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AttributesViewModel attributesViewModel, zz.a<? super AnonymousClass1> aVar) {
                super(2, aVar);
                this.f27504b = attributesViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new AnonymousClass1(this.f27504b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.f27503a == 0) {
                    f.b(obj);
                    this.f27504b.l();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // g00.p
            public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(CategoryDao categoryDao, int i11, AttributesViewModel attributesViewModel, zz.a<? super AnonymousClass4> aVar) {
            super(2, aVar);
            this.f27500d = categoryDao;
            this.f27501e = i11;
            this.f27502f = attributesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.f27500d, this.f27501e, this.f27502f, aVar);
            anonymousClass4.f27499c = obj;
            return anonymousClass4;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r7.f27498b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.f.b(r8)
                goto L8d
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.f27497a
                com.forsale.app.datalayer.database.CategoryEntity r1 = (com.forsale.app.datalayer.database.CategoryEntity) r1
                java.lang.Object r3 = r7.f27499c
                kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                kotlin.f.b(r8)
                goto L64
            L2a:
                java.lang.Object r1 = r7.f27499c
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.f.b(r8)
                goto L4b
            L32:
                kotlin.f.b(r8)
                java.lang.Object r8 = r7.f27499c
                kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
                com.forsale.app.datalayer.repositories.CategoryDao r1 = r7.f27500d
                int r5 = r7.f27501e
                r7.f27499c = r8
                r7.f27498b = r4
                java.lang.Object r1 = r1.getCategorySuspendById(r5, r7)
                if (r1 != r0) goto L48
                return r0
            L48:
                r6 = r1
                r1 = r8
                r8 = r6
            L4b:
                com.forsale.app.datalayer.database.CategoryEntity r8 = (com.forsale.app.datalayer.database.CategoryEntity) r8
                com.forsale.app.datalayer.repositories.CategoryDao r4 = r7.f27500d
                int r5 = r8.getParentId()
                r7.f27499c = r1
                r7.f27497a = r8
                r7.f27498b = r3
                java.lang.Object r3 = r4.getCategorySuspendById(r5, r7)
                if (r3 != r0) goto L60
                return r0
            L60:
                r6 = r1
                r1 = r8
                r8 = r3
                r3 = r6
            L64:
                com.forsale.app.datalayer.database.CategoryEntity r8 = (com.forsale.app.datalayer.database.CategoryEntity) r8
                com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel r4 = r7.f27502f
                androidx.lifecycle.b0 r4 = r4.j()
                r4.postValue(r8)
                com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel r8 = r7.f27502f
                androidx.lifecycle.b0 r8 = r8.e()
                r8.postValue(r1)
                com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel$4$1 r8 = new com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel$4$1
                com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel r1 = r7.f27502f
                r4 = 0
                r8.<init>(r1, r4)
                r7.f27499c = r4
                r7.f27497a = r4
                r7.f27498b = r2
                java.lang.Object r8 = com.forsale.app.utils.CoroutinesExtensionsKt.a(r3, r8, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                wz.p r8 = wz.p.f75480a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass4) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AttributesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class MoreButtonState {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ MoreButtonState[] $VALUES;
        public static final MoreButtonState INVISIBLE = new MoreButtonState("INVISIBLE", 0);
        public static final MoreButtonState SEE_MORE = new MoreButtonState("SEE_MORE", 1);
        public static final MoreButtonState SEE_LESS = new MoreButtonState("SEE_LESS", 2);

        private static final /* synthetic */ MoreButtonState[] $values() {
            return new MoreButtonState[]{INVISIBLE, SEE_MORE, SEE_LESS};
        }

        static {
            MoreButtonState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private MoreButtonState(String str, int i11) {
        }

        public static a00.a<MoreButtonState> getEntries() {
            return $ENTRIES;
        }

        public static MoreButtonState valueOf(String str) {
            return (MoreButtonState) Enum.valueOf(MoreButtonState.class, str);
        }

        public static MoreButtonState[] values() {
            return (MoreButtonState[]) $VALUES.clone();
        }
    }

    /* compiled from: AttributesViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27505a;

        static {
            int[] iArr = new int[TranslationRepository.Translation.values().length];
            try {
                iArr[TranslationRepository.Translation.ARABIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TranslationRepository.Translation.ENGLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27505a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f27506a;

        b(l function) {
            o.i(function, "function");
            this.f27506a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f27506a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27506a.invoke(obj);
        }
    }

    public AttributesViewModel(LiveData<List<AttributesMapper.AttributesDataModel>> extraAttrs, int i11, LiveData<TranslationRepository.Translation> translation, CategoryDao categoryDao, CoroutineScope scope) {
        ArrayList arrayList;
        int y11;
        o.i(extraAttrs, "extraAttrs");
        o.i(translation, "translation");
        o.i(categoryDao, "categoryDao");
        o.i(scope, "scope");
        this.f27484a = translation;
        this.f27485b = scope;
        this.f27486c = new z<>();
        boolean z11 = false;
        OneShotEventHandler<Boolean> oneShotEventHandler = new OneShotEventHandler<>(null, 0, 3, null);
        List<AttributesMapper.AttributesDataModel> value = extraAttrs.getValue();
        oneShotEventHandler.k(Boolean.valueOf(!((value == null || value.isEmpty()) ? true : z11)));
        this.f27487d = oneShotEventHandler;
        List<AttributesMapper.AttributesDataModel> value2 = extraAttrs.getValue();
        if (value2 != null) {
            List<AttributesMapper.AttributesDataModel> list = value2;
            y11 = s.y(list, 10);
            arrayList = new ArrayList(y11);
            for (AttributesMapper.AttributesDataModel attributesDataModel : list) {
                arrayList.add(new AttributeItemViewModel(attributesDataModel, this.f27484a));
            }
        } else {
            arrayList = null;
        }
        b0 b0Var = new b0(arrayList);
        this.f27488e = b0Var;
        z<MoreButtonState> zVar = new z<>();
        zVar.setValue(MoreButtonState.INVISIBLE);
        this.f27489f = zVar;
        this.f27490g = new b0<>();
        this.f27491h = new b0<>();
        this.f27492i = new z<>();
        this.f27493j = new z<>();
        this.f27486c.b(b0Var, new b(new l<List<? extends AttributeItemViewModel>, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel.1
            {
                super(1);
            }

            public final void b(List<AttributeItemViewModel> list2) {
                AttributesViewModel.this.d().setValue(list2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends AttributeItemViewModel> list2) {
                b(list2);
                return wz.p.f75480a;
            }
        }));
        this.f27486c.b(zVar, new b(new l<MoreButtonState, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel.2
            {
                super(1);
            }

            public final void b(MoreButtonState moreButtonState) {
                List<AttributeItemViewModel> list2 = (List) AttributesViewModel.this.f27488e.getValue();
                if (list2 != null) {
                    AttributesViewModel attributesViewModel = AttributesViewModel.this;
                    if (attributesViewModel.i().getValue() == MoreButtonState.SEE_MORE) {
                        attributesViewModel.d().postValue(list2.subList(0, 6));
                    } else if (!o.d(attributesViewModel.d().getValue(), attributesViewModel.f27488e.getValue())) {
                        attributesViewModel.d().postValue(list2);
                    }
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(MoreButtonState moreButtonState) {
                b(moreButtonState);
                return wz.p.f75480a;
            }
        }));
        zVar.b(b0Var, new b(new l<List<? extends AttributeItemViewModel>, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel.3
            {
                super(1);
            }

            public final void b(List<AttributeItemViewModel> list2) {
                boolean z12;
                List<AttributeItemViewModel> list3 = list2;
                if (list3 != null && !list3.isEmpty()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12 && list2.size() > 6) {
                    if (list2.size() > 6) {
                        AttributesViewModel.this.i().setValue(MoreButtonState.SEE_MORE);
                        return;
                    }
                    return;
                }
                AttributesViewModel.this.i().setValue(MoreButtonState.INVISIBLE);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends AttributeItemViewModel> list2) {
                b(list2);
                return wz.p.f75480a;
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(this.f27485b, null, null, new AnonymousClass4(categoryDao, i11, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        this.f27493j.b(this.f27484a, new b(new l<TranslationRepository.Translation, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel$trackCategoryName$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(TranslationRepository.Translation translation) {
                String str;
                z<String> f11 = AttributesViewModel.this.f();
                CategoryEntity value = AttributesViewModel.this.e().getValue();
                if (value != null) {
                    str = AttributesViewModel.this.c(translation, value);
                } else {
                    str = null;
                }
                f11.setValue(str);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(TranslationRepository.Translation translation) {
                b(translation);
                return wz.p.f75480a;
            }
        }));
        this.f27492i.b(this.f27484a, new b(new l<TranslationRepository.Translation, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel$trackCategoryName$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(TranslationRepository.Translation translation) {
                String str;
                z<String> g11 = AttributesViewModel.this.g();
                CategoryEntity value = AttributesViewModel.this.j().getValue();
                if (value != null) {
                    str = AttributesViewModel.this.c(translation, value);
                } else {
                    str = null;
                }
                g11.setValue(str);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(TranslationRepository.Translation translation) {
                b(translation);
                return wz.p.f75480a;
            }
        }));
    }

    public final String c(TranslationRepository.Translation translation, CategoryEntity cat) {
        int i11;
        o.i(cat, "cat");
        if (translation == null) {
            i11 = -1;
        } else {
            i11 = a.f27505a[translation.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return cat.getName();
            }
            return cat.getNameEn();
        }
        return cat.getNameAr();
    }

    public final z<List<AttributeItemViewModel>> d() {
        return this.f27486c;
    }

    public final b0<CategoryEntity> e() {
        return this.f27491h;
    }

    public final z<String> f() {
        return this.f27493j;
    }

    public final z<String> g() {
        return this.f27492i;
    }

    public final OneShotEventHandler<Boolean> h() {
        return this.f27487d;
    }

    public final z<MoreButtonState> i() {
        return this.f27489f;
    }

    public final b0<CategoryEntity> j() {
        return this.f27490g;
    }

    public final void k() {
        MoreButtonState value = this.f27489f.getValue();
        MoreButtonState moreButtonState = MoreButtonState.SEE_MORE;
        if (value == moreButtonState) {
            this.f27489f.setValue(MoreButtonState.SEE_LESS);
        } else {
            this.f27489f.setValue(moreButtonState);
        }
    }
}
