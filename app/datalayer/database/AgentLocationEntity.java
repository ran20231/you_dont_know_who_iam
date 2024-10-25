package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import up.c;
/* compiled from: AgentLocationEntity.kt */
/* loaded from: classes2.dex */
public final class AgentLocationEntity {
    public static final String AGENTS_LOCATIONS_TABLE = "agents_locations";
    public static final String AGENT_ID = "agent_id";
    public static final String ID = "id";
    public static final String IS_ACTIVE = "is_active";
    public static final String LOCATION_ID = "location_id";
    @c(AGENT_ID)
    private final int agentId;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22299id;
    @c("is_active")
    private int isActive = 1;
    @c(LOCATION_ID)
    private final int locationId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AgentLocationEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AgentLocationEntity(int i11, int i12, int i13) {
        this.f22299id = i11;
        this.agentId = i12;
        this.locationId = i13;
    }

    public static /* synthetic */ AgentLocationEntity copy$default(AgentLocationEntity agentLocationEntity, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = agentLocationEntity.f22299id;
        }
        if ((i14 & 2) != 0) {
            i12 = agentLocationEntity.agentId;
        }
        if ((i14 & 4) != 0) {
            i13 = agentLocationEntity.locationId;
        }
        return agentLocationEntity.copy(i11, i12, i13);
    }

    public final int component1() {
        return this.f22299id;
    }

    public final int component2() {
        return this.agentId;
    }

    public final int component3() {
        return this.locationId;
    }

    public final AgentLocationEntity copy(int i11, int i12, int i13) {
        return new AgentLocationEntity(i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentLocationEntity)) {
            return false;
        }
        AgentLocationEntity agentLocationEntity = (AgentLocationEntity) obj;
        if (this.f22299id == agentLocationEntity.f22299id && this.agentId == agentLocationEntity.agentId && this.locationId == agentLocationEntity.locationId) {
            return true;
        }
        return false;
    }

    public final int getAgentId() {
        return this.agentId;
    }

    public final int getId() {
        return this.f22299id;
    }

    public final int getLocationId() {
        return this.locationId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f22299id) * 31) + Integer.hashCode(this.agentId)) * 31) + Integer.hashCode(this.locationId);
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public String toString() {
        int i11 = this.f22299id;
        int i12 = this.agentId;
        int i13 = this.locationId;
        return "AgentLocationEntity(id=" + i11 + ", agentId=" + i12 + ", locationId=" + i13 + ")";
    }
}
