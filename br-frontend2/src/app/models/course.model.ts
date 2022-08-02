export class Course {

    constructor(
        private _id: number | null,
        private _developerType: string,
        private _lenguage: string,
        private _courseName: string,
        private _description: string,
        private _startDate: string,
    ) { }

    public get id(): number | null {
        return this._id;
    }
    public set id(value: number | null) {
        this._id = value;
    }

    public get developerType(): string {
        return this._developerType;
    }
    public set developerType(value: string) {
        this._developerType = value;
    }

    public get lenguage(): string {
        return this._lenguage;
    }
    public set lenguage(value: string) {
        this._lenguage = value;
    }

    public get courseName(): string {
        return this._courseName;
    }
    public set courseName(value: string) {
        this._courseName = value;
    }

    public get description(): string {
        return this._description;
    }
    public set description(value: string) {
        this._description = value;
    }

    public get startDate(): string {
        return this._startDate;
    }
    public set startDate(value: string) {
        this._startDate = value;
    }

    public toJSON(): object {
        return {
            id: this._id,
            developerType: this._developerType,
            lenguage: this._lenguage,
            courseName: this._courseName,
            description: this._description,
            startDate: this._startDate
        };
    }
    
}
